package ch.lazzaretti.exam;

import java.util.*;

/**
 * Created by flazz on 20.01.2017.
 */
public class Main {
    public static void main(String[] args){
        /*Set<Person> group = new HashSet<>();

        Person me = new Person("Fabrizio");
        Person other = new Person("Other");
        Person third = new Person("third");
        Person everyFriend = new Person("everyFriend");
        Person friend = new Person("Friend");

        me.addFriend(everyFriend);
        other.addFriend(everyFriend);
        third.addFriend(everyFriend);
        me.addFriend(other);
        everyFriend.addFriend(friend);

        group.add(me);
        group.add(third);

        List<String> all = group.stream().limit(15)
                .map(member -> member.getFriends())
                .flatMap(friends -> friends.stream())
                .map(Person::getName)
                .sorted(String::compareTo)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(all.toString());
        System.out.println(all.getClass().toString());
        System.out.println("all = " + all);//*/

        //System.out.println( (new int[] {1}).length );

        /*Pattern p = Pattern.compile(".*\n(\r)?(?<PLZ>[A-Z]{1,2}-[0-9]{4,5}) [A-z]+");
        Matcher m = p.matcher("12 Rue du Temple,\nF-51100 Reims");
        System.out.println(m.find());
        System.out.println(m.group("PLZ"));//Postleitzahl//*/

        /*Pattern p = Pattern.compile("[A-z]+(?<R>[0-9]+)");
        Matcher m = p.matcher("abcd123");
        if(m.find())
            System.out.println( m.group("R"));//*/

        //IntStream.generate((new Random())::nextInt).limit(10).sorted().forEach(System.out::println);

        /*System.out.println(Math.abs(1/3.0));
        System.out.println(1/3.0);
        double a=0.3, b=0.1+0.1+0.1;
        System.out.println(a==b);
        System.out.println(Math.abs(a-b)<1E-6);//*/

        Collection<String> s = new HashSet<>();
        //Collection<String> s = new ArrayList<>();
        s.add("test");
        s.contains("test");
        s.remove("test");
        //s.addAll(Collection<> c);
        s.size();
        s.toArray();

    }
}

class Person{

    private final String name;

    private final Set<Person> friends;

    public Person(String name){
        this.name = name;
        this.friends = new HashSet<>();
    }

    public Set<Person> getFriends() {
        return friends;
    }

    public String getName() {
        return name;
    }

    public void addFriend(Person p){
        friends.add(p);
    }
}