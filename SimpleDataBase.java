import java.util.Scanner;

public class SimpleDataBase {
    public static void main(String[] args) {
        int input = 0;
        Scanner sc = new Scanner(System.in);
        while (input != 8) {
            System.out.println("*******************************");
            System.out.println("Press 1 to see databases");
            System.out.println("Press 2 to see tables");
            System.out.println("Press 3 to see the table");
            System.out.println("Press 4 to enter data into the table");
            System.out.println("Press 5 to delete a record");
            System.out.println("Press 6 to delete a table");
            System.out.println("press 7 to create a table");
            System.out.println("press 8 to exit");
            System.out.println("*******************************");
            input = sc.nextInt();
            DataBase db = new DataBase();
            switch (input) {
                case 1:
                    db.showDatabases();
                    break;
                case 2:
                    db.showTables();
                    break;
                case 3:
                    System.out.print("Enter table name : ");
                    String t_name = sc.next();
                    db.seeTable(t_name);
                    break;
                case 4:
                    System.out.print("Enter table name : ");
                    sc.nextLine();
                    String table_name = sc.nextLine();
                    System.out.print("Enter id : ");
                    int id = sc.nextInt();
                    System.out.print("Enter name : ");
                    String name = sc.next();
                    db.insert(table_name, id, name);
                    break;
                case 5:
                    System.out.print("Enter table name : ");
                    String tableName = sc.next();
                    System.out.print("Enter id : ");
                    id = sc.nextInt();
                    db.delete(tableName, id);
                    break;
                case 6:
                    System.out.print("Enter table name to delete : ");
                    String table = sc.next();
                    db.deleteTable(table);
                    break;
                case 7:
                    System.out.print("Enter table name : ");
                    String tname = sc.next();
                    db.createTable(tname);
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Invalid input try again");
            }
        }
    }

}
