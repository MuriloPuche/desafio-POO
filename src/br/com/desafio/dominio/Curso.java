package br.com.desafio.dominio;

public class Curso {
       private String tiutulo;
       private String descricao;
        private int cargaHoraria;

        public String getTiutulo() {
                return tiutulo;
        }

        public void setTiutulo(String tiutulo) {
                this.tiutulo = tiutulo;
        }

        public String getDescricao() {
                return descricao;
        }

        public void setDescricao(String descricao) {
                this.descricao = descricao;
        }

        public int getCargaHoraria() {
                return cargaHoraria;
        }

        public void setCargaHoraria(int cargaHoraria) {
                this.cargaHoraria = cargaHoraria;
        }

        @Override
        public String toString() {
                return "Curso{" +
                        "tiutulo='" + tiutulo + '\'' +
                        ", descricao='" + descricao + '\'' +
                        ", cargaHoraria=" + cargaHoraria +
                        '}';
        }
}
