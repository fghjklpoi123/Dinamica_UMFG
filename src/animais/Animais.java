package animais;

import animais.interfaceComportamentos.ComportamentoAnimais;

public abstract class Animais implements ComportamentoAnimais {
        private String nome;
        private String raca;
        private int idade;


        public Animais(String nome, String raca, int idade) {
            super();
            this.nome = nome;
            this.raca = raca;
            this.idade = idade;
        }

        @Override
        public void andar() {
            System.out.println(getNome() + " está andando");
        }


        @Override
        public void comer() {
            System.out.println(getNome() + " está comendo");
        }

        @Override
        public void dormir() {
            System.out.println(getNome() + " está Dormindo. ZZZZ");
        }
        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public String getRaca() {
            return raca;
        }
        public void setRaca(String raca) {
            this.raca = raca;
        }
        public int getIdade() {
            return idade;
        }
        public void setIdade(int idade) {
            this.idade = idade;
        }



    }

