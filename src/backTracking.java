public class backTracking {

    public String swap(String str, int i, int j)
    {
        char ch[] = str.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        str = new String(ch);
        return str;
    }

    public void permuteString_naive(String str, int l, int r){
        if(l == r){
            System.out.println(str);
            return;
        }
        else{
            for(int i = l; i <= r; i++){
                str = swap(str, l, i);
                permuteString_naive(str, l+1, r);
                swap(str, l, i);
            }
        }
    }
}
