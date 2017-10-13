/**
 * Created by dgunda on 9/21/17.
 */
public class RemoveCommentsFromCode {
    public static void main(String[] args) {
        String testString  = "//test \n test ";
        System.out.println(removeCommentsFromCode(testString));

    }
    public static String removeCommentsFromCode(String s){
        boolean singleComment = false;
        boolean blockComment = false;
        StringBuilder sb = new StringBuilder();
        for (int i =0; i<s.length();i++){
            if(singleComment == true && s.charAt(i)=='\n'){
                singleComment = false;
            }else if(s.charAt(i)=='/' && s.charAt(i+1)=='/'){
                singleComment = true;
                i++;
            }else if(s.charAt(i)== '/' && s.charAt(i+1)== '*'){
                blockComment = true;
                i++;
            }else if(blockComment == true && (s.charAt(i)== '*' && s.charAt(i+1) == '/')) {
                blockComment = false;
                i++;
            }else if(blockComment || singleComment){
                continue;
            }else
                sb = sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
