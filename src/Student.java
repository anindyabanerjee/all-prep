public record Student(String name, int age, Contact contactDetails) {
    public void institution(){
        System.out.println("AGCS");
    }
    public static class Contact{
        private final String email;
        private final String phone;

        public Contact(String email, String phone){
            this.email = email;
            this.phone = phone;
        }
        public String getEmail(){
            return email;
        }

        public String getPhone(){
            return phone;
        }
    }
}
