public class AgeRating {
    public static void main (String[] args){
        String nameClient1 = "Fulano";
        String nameClient2 = "Cicrano";

        int yearBirthDay1 = 1980;
        int yearBirthDay2 = 2000;

        int ageClient1 = 0;
        int ageClient2 = 0;

        System.out.println(">>> Listagem dos Clientes");
        System.out.println("________________________________________");

        System.out.println("Nome: " + nameClient1);
        System.out.println("Ano de Nascimento: " + yearBirthDay1);
        ageClient1 = 2024 - yearBirthDay1;
        System.out.println("Idade: " + ageClient1);

        if (ageClient1 >= 60)
        {
            System.out.println("Característica Etária: IDOSO");
        }
        else if (ageClient1 >= 30 && ageClient1 <= 59)
        {
            System.out.println("Característica Etária: ADULTO");
        }
        else if (ageClient1 >= 18 && ageClient1 <= 29)
        {
            System.out.println("Característica Etária: JOVEM");
        }
        else
        {
            System.out.println("Característica Etária: ADOLESCENTE");
        }
        System.out.println("________________________________________");

        System.out.println("Nome: " + nameClient2);
        System.out.println("Ano de Nascimento: " + yearBirthDay2);
        ageClient2 = 2024 - yearBirthDay2;
        System.out.println("Idade: " + ageClient2);

        if (ageClient2 >= 60) {
            System.out.println("Característica Etária: IDOSO");
        }else if (ageClient2 >= 30 && ageClient2 <= 59){
            System.out.println("Característica Etária: ADULTO");
        }else if (ageClient2 >= 18 && ageClient2 <= 29){
            System.out.println("Característica Etária: JOVEM");
        }else{
            System.out.println("Característica Etária: ADOLESCENTE");
        }
    }
}
