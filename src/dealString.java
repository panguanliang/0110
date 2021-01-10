public class dealString {
    public static void main(String[] args) {
        String str="dispse manage deal with handle conduct";
        String strings[]=str.split("\\s");
        String newString[]=m1(strings);
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<newString.length;i++) {
            sb.append(newString[i]);
            sb.append(" ");
        }
        System.out.println("将每个单词的首字母换为大写："+sb.toString());
    }
    public static String[] m1(String[] str){
        String newString[]=new String[str.length];
        for(int i=0;i<str.length;i++){
            char c[]={str[i].charAt(0)};
            String string=new String(c);
            String part1=string.toUpperCase();
            String part2=str[i].substring(1);
            newString[i]=part1.concat(part2);
        }
        return newString;
    }
}
