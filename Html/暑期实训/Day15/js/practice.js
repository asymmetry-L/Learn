function topicOne() {
  var a = document.input.a.value;
  var b = document.input.b.value;
  var c;
  var result;
  if (a > b) {
    c = a;
    a = b;
    b = c;
    document.input.print_1.value = a + "," + b;
  } else {
    document.input.print_1.value = a + "," + b;
  }
}
function topicTwo() {
  var a = document.input.c.value;
  var b = document.input.d.value;
  document.input.print_2.value = b + "," + a;
}
function topicThree() {
  var a = document.input.e.value;
  var b = document.input.f.value;
  var c = document.input.g.value;
  var d;
  if (a > b) {
    d = a;
    a = b;
    b = d;
  }
  if (a > c) {
    d = a;
    a = c;
    c = d;
  }
  if (b > c) {
    d = b;
    b = c;
    c = d;
  }
  document.input.print_3_1.value = c;
  document.input.print_3_2.value = a;
}
function topicFour() {
  var board = document.getElementById("topic_4");
  var table = document.createElement("table");
  var str;
  for (let i = 1; i < 10; i++) {
    str = "<tr>";
    for (let j = 1; j <= i; j++) {
      // str += i+"*"+j+"="+i*j+" ";
      str += "<td>" + i + "*" + j + "=" + i * j + " </td>";
    }
    str += "</tr>";
    table.innerHTML += str;
  }
  board.appendChild(table);
}
function topicFive() {
  var rangeA = document.input.i.value;
  var rangeL = document.input.j.value;
  var numList = "";
  for (rangeA; rangeA <= rangeL; rangeA++) {
    if (rangeA % 2 == 0) {
      numList += rangeA + ",";
    }
  }
  document.input.print_5.value = numList;
}
function topicSix_1() {
  var rangeA = document.input.i.value;
  var rangeL = document.input.j.value;
  var sum = 0;
  for (rangeA; rangeA <= rangeL; rangeA++) {
    sum += parseInt(rangeA);
  }
  document.input.print_5.value = sum;
}
function topicSix_2(){
  var rangeA = document.input.i.value;
  var rangeL = document.input.j.value;
  var sum = 0;
  while (rangeA<=rangeL) {
    sum += parseInt(rangeA);
    rangeA++;
  }
  document.input.print_5.value = sum;
}
function topicSix_3(){
  var rangeA = document.input.i.value;
  var rangeL = document.input.j.value;
  var sum = 0;
  do {
    sum += parseInt(rangeA);
    rangeA++;
  }while (rangeA<=rangeL)
  document.input.print_5.value = sum;
}
function topicSeven() {
  var rangeA = document.input.i.value;
  var rangeL = document.input.j.value;
  var fact = 1;
  for (rangeA; rangeA <= rangeL; rangeA++) {
    fact *= parseInt(rangeA);
  }
  document.input.print_5.value = fact;
}
function topicEight() {
  var rangeA = document.input.i.value;
  var rangeL = document.input.j.value;
  var sum = 0;
  for (rangeA; rangeA <= rangeL; rangeA++) {
    if (rangeA%2==1) {
      sum += parseInt(rangeA);
    }
  }
  document.input.print_5.value = sum;
}
function topicNine() {
  var rangeA = document.input.i.value;
  var rangeL = document.input.j.value;
  var count = 0;
  for (rangeA; rangeA <= rangeL; rangeA++) {
    if (rangeA%2==0) {
      count++;
    }
  }
  document.input.print_5.value = count;
}