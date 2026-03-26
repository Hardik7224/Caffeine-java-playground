package minor_projects;
// Creating String Library manually containing its basic functions
public class StringLib
    {
        int[] data = new int[6];
        int length = 0;

        // Methods for string operations
        public int length() {
            int count = 0;
            for(int i=0; i < length; i++) {
                count++;
            }
            return count;
        }

        public void append(int ch) {
            data[length] = ch;
            length++;
        }

        public void print(){
            for(int i=0; i < length; i++){
                char c = (char) data[i];
                System.out.print(c);
            }
            System.out.println();
        }

        public StringLib toUpperCase() {
            for (int i = 0; i < this.length; i++) {
                if (data[i] >= 'a' && data[i] <= 'z') {
                    data[i] = data[i] - 32;
                }
            }
            return this;
        }

        public StringLib toLowerCase() {
            for (int i = 0; i < this.length; i++) {
                if (data[i] >= 'A' && data[i] <= 'Z') {
                    data[i] = data[i] + 32;
                }
            }
            return this;
        }

        public char charAt(int index) {
            if (index < 0 || index >= this.length) {
                return '\0';
            }
            return (char) this.data[index];
        }

        public boolean isEmpty(){
            if(this.length == 0){
                return true;
            }
            return false;
        }

        public boolean isBlank() {
            if(this.length == 0){
                return true;
            }
            for(int i = 0; i < this.length; i++){
                char c = (char) this.data[i];
                if (c != ' ' && c != '\t' && c != '\n'){
                    return false;
                }
            }
            return true;
        }

        public boolean equals(StringLib other) {
            if (this == other) {
                return true;
            }
            if (this.length != other.length) {
                return false;
            }
            for (int i = 0; i < this.length; i++) {
                if (this.data[i] != other.data[i]) {
                    return false;
                }
            }
            return true;
        }

        public int compareTo(StringLib other) {
            int minLen;
            if (this.length < other.length) {
                minLen = this.length;
            } else {
                minLen = other.length;
            }
            for (int i = 0; i < minLen; i++) {
                if (this.data[i] != other.data[i]) {
                    return this.data[i] - other.data[i];
                }
            }
            return this.length - other.length;
        }

        public StringLib concat(StringLib b) {
            StringLib str = new StringLib();
            for (int i = 0; i < this.length; i++) {
                str.append(this.data[i]);
            }
            for(int i = 0; i < b.length; i++) {
                str.append(b.data[i]);
            }
            return  str;
        }

        public StringLib trim(){
            int l = 0;
            int r = this.length - 1;
            while (data[l] == ' ') {
                l++;
            }
            while (data[r] == ' ') {
                r--;
            }
            StringLib result = new StringLib();
            for (int i = l; i <= r; i++) {
                result.append(data[i]);
            }
            return result;
        }

        public boolean startsWith(StringLib b){
            if(this.length < b.length){
                return false;
            }
            for(int i=0;i< b.length;i++) {
                if( this.data[i] != b.data[i]){
                return false;
                }
            }
            return true;
        }

        public boolean startsWith(StringLib b , int offset){
            if(this.length < b.length){
                return false;
            }
            int k = b.length;
            for(int i=0;i<k;i++){
                if(this.data[offset + i] != b.data[i]){
                    return false;
                }
            }
            return true;
        }

        public boolean endsWith(StringLib b){
            if(this.length < b.length){
                return false;
            }
            int k = this.length - b.length;
            for(int i=0;i<k;i++){
                if(this.data[k + i] != b.data[i]){
                    return false;
                }
            }
            return true;
        }

        public int indexOf(int ch){
            int foundIndex = -1;
            for(int i=0;i<this.length;i++){
                if(this.data[i] == ch){
                    foundIndex = i;
                    break;
                }
            }
            return foundIndex;
        }

        public int indexOf(int offset , int ch){
            int foundIndex = -1;
            for(int i=offset;i<this.length;i++){
                if(this.data[i] == ch){
                    foundIndex = i;
                    break;
                }
            }
            return foundIndex;
        }

        public StringLib replace(char ch1,char ch2){
            for(int i=0;i<this.length;i++){
                if(this.data[i]==ch1){
                    this.data[i] = ch2;
                }
            }
            return this;
        }

        public StringLib substring(int start) {
            StringLib sub = new StringLib();
            for (int i = start; i < this.length; i++) {
                sub.append(this.data[i]);
            }
            return sub;
        }

        public StringLib substring(int start,int end) {
            StringLib sub = new StringLib();
            for (int i = start; i < end; i++) {
                sub.append(this.data[i]);
            }
            return sub;
        }


        // Main Function
    public static void main(String[] args) {

            StringLib s1 = new StringLib();
            s1.append('A');
            s1.append('B');
            s1.append('C');
            s1.append('D');
            System.out.print("s1: ");
            s1.print();

            StringLib s2 = new StringLib();
            s2.append(' ');
            s2.append('C');
            System.out.print("s2: ");
            s2.print();

            System.out.println("Length of s1: " + s1.length());
            System.out.println("s1[1]: " + s1.charAt(1));
            System.out.print("s1 in lowercase : ");
            s1.toLowerCase().print();
            System.out.print("s1 in uppercase : ");
            s1.toUpperCase().print();
            System.out.println("s1 is empty: " + s1.isEmpty());
            System.out.println("s1 is blank: " + s1.isBlank());
            System.out.println("Is \"ABCD\" equals to \" C\": " +s1.equals(s2));
            System.out.println("Comparing s1 and s2 results in: " + s1.compareTo(s2));
            System.out.print("Conceited string: ");
            s1.concat(s2).print();
            System.out.print("After trimming s2: ");
            s2.trim().print();
            System.out.println("s1 starts with s2: " + s1.startsWith(s2));
            System.out.println("s1 starts with s2: " + s1.startsWith(s2,1) );
            System.out.println("s1 ends with s2: " + s1.endsWith(s2));
            System.out.println("In s1 index of B is: " + s1.indexOf('B'));
            System.out.println("In s1 index of B is: " + s1.indexOf(0,'B'));
            System.out.print("Replacing C in s2 with A: ");
            s2.replace('C','A').print();
            System.out.print("Substring of s1 from s1[1]: ");
            s1.substring(1).print();
            System.out.print("Substring of s1: ");
            s1.substring(1,3).print();

        }
    }