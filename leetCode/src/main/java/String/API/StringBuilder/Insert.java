package String.API.StringBuilder;

class Insert {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("300.");
        System.out.println(sb.toString());
        sb.insert(4, "(");
        System.out.println(sb.toString()); // 300.(
    }
}
