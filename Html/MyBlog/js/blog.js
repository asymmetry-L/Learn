// 显示时间函数
function clock() {
    var date = new Date();
    var year = date.getFullYear() + '年';
    var month = date.getMonth().toString().length < 2 ? '&nbsp;&nbsp;' + (date.getMonth() + 1) : (date.getMonth() + 1).toString();
    var day = date.getDate().toString().length < 2 ? '&nbsp;&nbsp;' + date.getDate() : date.getDate().toString();
    var hour = date.getHours().toString().length < 2 ? '0' + date.getHours() : date.getHours().toString();
    var minute = date.getMinutes().toString().length < 2 ? '0' + date.getMinutes() : date.getMinutes().toString();
    var second = date.getSeconds().toString().length < 2 ? '0' + date.getSeconds() : date.getSeconds().toString();
    var time = hour + ':' + minute + ':' + second;
    document.getElementById("time").innerHTML = time;
    document.getElementById("year").innerHTML = year;
    document.getElementById("day").innerHTML = month + "月" + day + '日';
    setTimeout('clock()', 1000);
}
window.onload = clock;

// 导航栏切换
function rollNav_l() {
    var nav = document.getElementById('skill-tag');
    var bf = nav.children[1];
    var show = nav.children[2];
    var hidden = nav.children[1];
    var lt = nav.children[nav.children.length - 1];
    nav.insertBefore(bf, lt);
    show.style.color = "#fca106";
    hidden.style.color = "#fca10650";
    document.getElementById(hidden.innerHTML).className = "hidden";
    document.getElementById(show.innerHTML).className = "show";
    // alert(hidden);
}
function rollNav_r() {
    var nav = document.getElementById('skill-tag');
    var bf = nav.children[1];
    var show = nav.children[nav.children.length - 2];
    var hidden = nav.children[1];
    var lt = nav.children[nav.children.length - 2];
    nav.insertBefore(lt, bf);
    // console.log(nav.children);
    show.style.color = "#fca106";
    hidden.style.color = "#fca10650";
    document.getElementById(show.innerHTML).className = "show";
    document.getElementById(hidden.innerHTML).className = "hidden";
}

