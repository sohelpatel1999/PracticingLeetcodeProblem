var gcdOfStrings = function(str1, str2) {
    if(!(str1 + str2 === str2 + str1 )){
        return "";
    }

    return str1.substring(0, gcd(str1.length,str2.length))
}

function gcd(a,b){
    while (b!=0) {
        temp = b;
        b= a%b;
        a=temp;
    }
    return a;
}

const answer = gcdOfStrings("ABCABC","ABC")
console.log(answer);