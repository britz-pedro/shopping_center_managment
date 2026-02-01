public class Data {
    private int dia;
    private int mes;
    private int ano;

    //Método construtor com verificação caso a quantidade de dias esteja ok para o mês colocado
    public Data(int dia, int mes, int ano){
        boolean dataValida = false;
        switch(mes){
            case 4:
            case 6:
            case 9: 
            case 11:  
                if (dia <= 30 && dia >=1)
                    dataValida = true;
            break;

            case 1:
            case 3:
            case 5: 
            case 7:
            case 8:
            case 10: 
            case 12:
                if (dia <=31 && dia >=1)
                    dataValida = true;
            break;

            case 2:
                if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){
                    if (dia <= 29 && dia >= 1)
                        dataValida = true;
                }
                else {
                    if (dia <= 28 && dia >= 1)
                        dataValida = true;
                }
            break; 
        }

        if(dataValida == true){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
            }

            else{
            System.out.println("Data inválida. A data será definida para 1/1/2000");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
            }
    }

    public int getDia(){
        return dia;
    }
    public int getMes(){
        return mes;
    }
    public int getAno(){
        return ano;
    }

    public void setDia(int dia){
        this.dia = dia;
    }
    public void setMes(int mes){
        this.mes = mes;
    }
    public void setAno(int ano){
        this.ano = ano;
    }

    public String toString(){
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }

    public boolean verificaAnoBissexto(){
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0))
            return true;
        else
            return false;
    }
}
