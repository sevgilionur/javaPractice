package day09_PracticeTask;

public class ChooseLanguage {

    public static void main(String[] args) {

        int selection = 2;
        String result = "";

        if(selection == 1){
            result = "Hello, thanks for your call";
        }else if(selection == 2){
            result = "Hola, gracias para llamar";
        }else if(selection == 3){
            result = "Merhaba, aradiginiz icin tesekkurler";
        }else if(selection == 4){
            result = "Privet, spasibo za vash zvonok";
        }else{
            result = "Merci ,pour votre appel";
        }

        System.out.println(result);
    }
}
