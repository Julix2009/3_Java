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
//servus



        }