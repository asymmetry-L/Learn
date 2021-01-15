function topic_1() {
    var string_1 = document.getElementById("num_1").value;
    var sum = 0;
    for(let i=0;i<string_1.length;i++){
        sum += parseInt(string_1.charAt(i));
    }
    alert(sum);
}
function calculator(){
    var equation = document.getElementById("input").value;
    var character = ["+","-","*","/","%"];
    console.log(equation.split(character))
    // for (const char in character) {
    //     // var charAddr=equation.indexOf(char)

            
        
    // }
}