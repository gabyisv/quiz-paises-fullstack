let contPontuacao = 0;
let perguntasFeitas = 0;
const LIMITE_PERGUNTAS = 10;

let capitalCorreta = "";
let nomePais = "";

const elementoPontuacao = document.getElementById("contPontuacao");
const containerPrincipal = document.getElementById("container");
function verificarResposta(resposta, botaoClicado) {
    let botoes = document.querySelectorAll(".buttons-align button");
    
    for (let i = 0; i < botoes.length; i++) {
        botoes[i].style.pointerEvents = "none"; 
    }

    if (resposta === capitalCorreta) {
        botaoClicado.classList.add("btn-correto");
        contPontuacao++;
        document.getElementById("contPontuacao").textContent = contPontuacao;
    } else {
        botaoClicado.classList.add("btn-incorreto");
        
        for (let j = 0; j < botoes.length; j++) {
            if (botoes[j].textContent === capitalCorreta) {
                botoes[j].classList.add("btn-correto");
            }
        }
    }

    perguntasFeitas++;

    setTimeout(function() {
        
        for (let k = 0; k < botoes.length; k++) {
            botoes[k].classList.remove("btn-correto");
            botoes[k].classList.remove("btn-incorreto");
            botoes[k].style.pointerEvents = "auto";
        }

        if (perguntasFeitas >= LIMITE_PERGUNTAS) {
            finalizarJogo();
        } else {
            proximaPergunta();
        }

    }, 1000);
}

function proximaPergunta() {
    fetch("http://localhost:8080/api/paises")
        .then(resposta => resposta.json())
        .then(lista => {
            let indiceAleatorio = Math.floor(Math.random() * lista.length);
            let pais = lista[indiceAleatorio];

            nomePais = pais.nomePais;
            capitalCorreta = pais.capital;
            let codigo = pais.codigoIso;

            const elementoPergunta = document.getElementById("pergunta");

            elementoPergunta.textContent = `Qual é a capital de ${nomePais}?`;

            const elementoRodada = document.getElementById("rodadaAtual");
            elementoRodada.textContent = perguntasFeitas + 1; 

            const elementoBandeira = document.getElementById("bandeira");
            elementoBandeira.src = `https://flagcdn.com/w320/${codigo.toLowerCase()}.png`;

            let opcoes = [capitalCorreta];
            while(opcoes.length < 4) {
                let indiceAleatorioOpcao = Math.floor(Math.random() * lista.length);
                let capitalCandidata = lista[indiceAleatorioOpcao].capital;
                if(!opcoes.includes(capitalCandidata)) {
                    opcoes.push(capitalCandidata);
                }
            }

            opcoes.sort(() => Math.random() - 0.5);

            document.getElementById("bt1").textContent = opcoes[0];
            document.getElementById("bt2").textContent = opcoes[1];
            document.getElementById("bt3").textContent = opcoes[2];
            document.getElementById("bt4").textContent = opcoes[3];
        })
        .catch(erro => {
            console.error("Erro ao chamar API:", erro);
        });
}

function finalizarJogo() {
    containerPrincipal.innerHTML = `
        <div class="fim" style="text-align: center; padding: 40px;">
            <h1>Fim de Jogo!</h1>
            <div style="font-size: 60px; margin: 20px 0;"></div>
            <h2 >Pontuação Final: ${contPontuacao} de ${LIMITE_PERGUNTAS}</h2>
            
            <button onclick="location.reload()"> <img src="reload.png" alt="" class="img-recarregar"> Jogar Novamente</button>
        </div>
    `;
}

proximaPergunta();