import at.htlle.pos.Comperator.Student;
import at.htlle.pos.Comperator.StudentIDComparator;
import at.htlle.pos.Comperator.StudentNameComparator;

void main(){
    // SHIFT + Alt move lines up and down
    // CTRL+y delet line
    // dtrl +  D dublicate line
    List<Integer> myList = new ArrayList <>();

    for (int i = 0;  i< 10; i++) {
        myList.add(i); //Auto Boxing :)

    }

    for(Integer i : myList){ // auto unboxing
        System.out.println(i); //sout
    }
    System.out.println(myList.get(5));
    myList.set(5,67);


    for(Integer i : myList){ // auto unboxing
        System.out.println(i); //sout

    }

    for (int i = 0; i < myList.size(); i++) {
        int temp = myList.get(i);
        myList.set(i, temp + 120);

    }

    System.out.println("Verändert:");

    for(Integer i : myList){ // auto unboxing
        System.out.print(i+ ","); //sout

    }

    System.out.println("First"+"SECOND");

    String aStr = "First";
    String bstr = "Second";

    System.out.println(aStr+bstr);
    // using a Stringbuilder for many String concat aperations!!!
    StringBuilder sb = new StringBuilder();
    sb.append(aStr).append(",").append(" ").append(bstr);
    System.out.println(sb);

    System.out.println("---");
    Student myStudent = new Student( 76, "3IT", "Nowak");
    System.out.println(myStudent);

    System.out.println("create List of Students");
    List<Student> myStudentList = new ArrayList<>();

    myStudentList.add(new Student(0,"A","5IT"));
    myStudentList.add(new Student(1,"B","7IT"));
    myStudentList.add(new Student(2,"C","76IT"));

    System.out.println(myStudentList);

    // first compare attempt :)
    System.out.println("----");

    Student student1 = new Student(1, "G", "1Lit");
    Student student2 = new Student(2, "H", "4Lit");
    Student student3 = new Student(3, "F", "6Lit");

    System.out.println(student1.equals(student2));// false
    System.out.println(student1.equals(student1));//  true
    System.out.println(student1 == student2); // false
    System.out.println(student1 == student1); //true

    StudentIDComparator studentIDcomparator = new StudentIDComparator();
    System.out.println(studentIDcomparator.compare(student1,student2)); // -1
    System.out.println(studentIDcomparator.compare(student2,student1)); // 1
    System.out.println(studentIDcomparator.compare(student1,student1)); // 0

    System.out.println("--- name compare");

    StudentNameComparator studentnameComparator = new StudentNameComparator();
    System.out.println(studentnameComparator.compare(student1,student2));

    System.out.println("---");
    System.out.println("A".compareTo("B"));
    System.out.println("a".compareTo("c"));
    System.out.println("a".compareTo("z"));

    Comparator<Student> studentComparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getClassroom().compareTo(o2.getClassroom());
        }
    };

    Collections.shuffle(myList);
    System.out.println("my List unsortet: "+myStudentList);
    Collections.sort(myList);
    Collections.sort(myStudentList, null);
    System.out.println(myList);

    System.out.println("my StudentList sorted 'studentclassroom Comparator \n"
    +myStudentList);

    Comparator<Student>  myStudentClaasroomThenNameComparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1 , Student o2) {
            if(o1.getClassroom().compareTo(o2.getClassroom())==0){
                return o1.getName().compareTo(o2.getName());
            }
            return o1.getClassroom().compareTo(o2.getClassroom());
        }
    };

    Collections.sort(myStudentList, studen)



        }