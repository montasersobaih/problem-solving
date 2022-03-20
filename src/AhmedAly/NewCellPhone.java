package AhmedAly;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class NewCellPhone {

    public static void main(String[] args) throws Exception {
        BufferedReader data = new BufferedReader(new InputStreamReader(System.in));
        List<Contact> list = new ArrayList<Contact>();

        int tc = Integer.parseInt(data.readLine());
        while (tc-- > 0) {
            StringTokenizer tokenizer = new StringTokenizer(data.readLine());
            String name = tokenizer.nextToken().concat(" ").concat(tokenizer.nextToken());
            String phone = tokenizer.nextToken();

            list.add(new Contact(name, phone));
        }

        tc = Integer.parseInt(data.readLine());
        while (tc-- > 0) {
            StringTokenizer tokenizer = new StringTokenizer(data.readLine());
            String name = tokenizer.nextToken().concat(" ").concat(tokenizer.nextToken());
            String phone = tokenizer.nextToken();

            for (Contact contact : list) {
                if (name.equalsIgnoreCase(contact.getName())) {
                    contact.setName(name);
                    contact.setPhone(phone);
                    break;
                }
            }
        }

        for (Contact c : list) {
            System.out.println(c.getName().concat(" ").concat(c.getPhone()));
        }
    }

    private static class Contact {
        private String name, phone;

        public Contact(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }
    }
}
