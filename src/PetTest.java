public class PetTest {

    public static void main(String[] args) {
        SortedADT pet = new Pet();
        String name;
        Integer option=0;

        do {
            System.out.println("\n0: Quit");
            System.out.println("1: Add Pet Type");
            System.out.println("2: Display Pet Type");
            System.out.println("3: Find Pet Type");
            System.out.println("4: Remove Pet Type");

            option = Input.getInteger("Input option: ");
            switch (option) {
                case 0:
                    System.out.println("\nQuitting Program");
                    break;
                case 1:
                    name = Input.getString("Pet Type: ");
                    try{
                        pet.insert(name);
                        System.out.println("Inserted Pet Successfully");
                    }
                    catch(SortedADT.NotUniqueException e){
                        System.out.println("Insert Invalid - Pet Type Not Unique");
                    }
                    break;
                case 2:
                    System.out.println(((Pet)pet).getTraversals());
                    break;
                case 3:
                    name = Input.getString("Enter Pet Type: ");
                    try{
                        name=(String)pet.find(name);
                        System.out.println(name+" Pet Type Found");
                    }
                    catch(SortedADT.NotFoundException e){
                        System.out.println("Pet Type Not Found");
                    }
                    break;
                case 4:
                    name = Input.getString("Enter Pet Type: ");
                    try{
                        name=(String)pet.remove(name);
                        System.out.println(name+" Pet Type Removed");
                    }
                    catch(SortedADT.NotFoundException e){
                        System.out.println("Remove Invalid - Pet Type Not Found");
                    }
                    break;

                default:
                    System.out.println("\nInvalid option");
                    break;
            }
        } while (option != 0);
    }

}


