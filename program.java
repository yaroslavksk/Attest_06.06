import java.util.Scanner;
public class program {

    public static animalClass an = new animalClass(null, null);
    public static HomeAnimalClass ani = new HomeAnimalClass(null, null, null);
    public static PackAnimalClass anim = new PackAnimalClass(null, null, null, null);
    public static counterClass count = new counterClass();
    
    public static void basicinterface() {

        Scanner in = new Scanner(System.in);          
        System.out.println("Выбирайте: \n 1. Добавить простое животное \n 2. Добавить домашнее животное \n 3. Добавить тягловое животное \n 4. Посмотреть списки \n 5. Выйти \n");

        int num = in.nextInt();
        int id;
        String vid;
        String name;
        String pack;
        switch (num) {
            case  (1):
            try{
                System.out.println("Вводите параметры последовательно через Enter: ID, VID");
                Scanner init = new Scanner(System.in);
                id = in.nextInt();
                vid = init.nextLine();
                an.AddAnimal(id, vid);
                count.plus();
                basicinterface();
            }
            catch (Exception e) {
                System.out.println("Неверный ввод");
                basicinterface();
            }
                break;
            case (2):
            try{
                System.out.println("Вводите параметры последовательно через Enter: ID, VID, Name");
                Scanner init = new Scanner(System.in);
                id = in.nextInt();
                vid = init.nextLine();
                name = init.nextLine();
                ani.plus(id, vid, name);
                count.plus();
                basicinterface();
            }
            catch (Exception e) {
                System.out.println("Неверный ввод");
                basicinterface();
            }
                break;
            case (3):
                try{
                    System.out.println("Вводите параметры последовательно через Enter: ID, VID, Name, Pack");
                    Scanner init = new Scanner(System.in);
                    id = in.nextInt();
                    vid = init.nextLine();
                    name = init.nextLine();
                    pack = init.nextLine();
                    anim.plus(id, vid, name, pack);
                    count.plus();
                    basicinterface();
                }
                catch (Exception e) {
                    System.out.println("Неверный ввод");
                    basicinterface();
                }
                break;
            case (4):
                wiemer();
                break;
            case (5):
                System.exit(0);
                break;
            default:     
                basicinterface();
                break;
        }
        in.close();
    }

    public static void wiemer() {
        Scanner in = new Scanner(System.in);          
        System.out.println("Выбирайте: \n 1. Посмотреть простых животных \n 2. Посмотреть домашних животных \n 3. Посмотреть тягловых животных \n 4. Назад \n");

        int num = in.nextInt();

        switch (num) {
            case  (1):
                an.wiew();
                basicinterface();
                break;
            case (2):
                ani.wiew();
                basicinterface();
                break;
            case (3):
                anim.wiew();
                basicinterface();
                break;
            case (4):
                basicinterface();
                break;
            default:
                System.out.println("нет такого пункта \n");
                basicinterface();
                break;
        }
        in.close();
    }

    public static void main(String[] args) {
        
        //PackAnimalClass anim = new PackAnimalClass(null, null, null, null);
        //anim.plus(1, "my", "mu", "120");
       // anim.wiew();
        //System.out.println();
        
        //anim.wiew();

        basicinterface();
    }
}
