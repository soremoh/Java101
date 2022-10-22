package Students;

public class StudentsApp {
    public static void main(String[] args) {

        SearchUI searchUI = new SearchUI();
        Students students = new Students();
        StudentsSystem studentsSystem = new StudentsSystem();
        SearchUI_name searchUI_name = new SearchUI_name();


        do {
            System.out.println(studentsSystem.location);
            switch (studentsSystem.location){
                case 0 :
                    searchUI.entry();
                    studentsSystem.locate();
                    break;
                case 1 :
                    searchUI_name.showInput();
                    studentsSystem.setName();
                    students.addName(studentsSystem.name);
                    searchUI_name.confirm();
                    StudentsSystem.location=0;
                    continue;
                case 3:


                    break;
                case 5:
                    break;
            }


        }while(studentsSystem.location !=5);

        searchUI.exit();
    }
}
