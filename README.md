 //Given a list of numbers, find the even numbers, double them and print the output
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream()
               .filter(e -> e % 2 == 0)
               .map(e -> e * 2)
               .forEach(System.out::println);

        //Given a String, find a pattern of text and replace it with an input String
        Map<String, String> properties = new HashMap<String, String>();
        properties.put("firstname", "Kunal");
        properties.put("lastname", "Gaba");

        String input = "Hello! {firstname} {lastname}";

        String output =
                properties.keySet().stream()
                          .reduce(input, (y, e) -> y.replaceAll("\\{" + e + "\\}", properties.get(e)));

        System.out.println(output);


        //From a list of items, find items which matches a pattern and put them in a map with key as name and value as title
        class Person {
            String title;
            String name;

            public String getTitle() {
                return title;
            }

            public Person(String title, String name) {
                this.title = title;
                this.name = name;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Mr.", "Kunal Gaba"));
        persons.add(new Person("Mr.", "Sean Smith"));
        persons.add(new Person("Mrs.", "Beth Hearn"));

        System.out.println(
                persons.stream()
               .filter(e->e.getTitle().equals("Mr."))
               .collect(Collectors.toMap(Person::getName,Person::getTitle)));

