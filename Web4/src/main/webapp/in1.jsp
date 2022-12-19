<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
          href="https://fonts.googleapis.com/css?family=Rancho&effect=fire-animation"

>
<title>Insert title here</title>
</head>
<body>
<div class="d5">

<h1 style="font-size:60px;color:BLACK;
font-family:Rancho;position:absolute; text-align: center;left:370px;top:80px;font-weight:500;">WELCOME TO NUMBER GUESS GAME</h1>
<h1 style="font-size:40px;color:BLACK;position:absolute;left:380px;top:190px;font-weight:500;">PLEASE CLICK ON GO TO CONTINUE</h1>
<form action="/homem">
<h1 style="font-size:30px;color:BLACK;position:absolute;left:590px;top:270px;font-weight:200;">ENTER YOUR NAME</h1>
  <H2><input style="font-size:40px;color:BLACK;position:absolute;left:440px;top:350px;font-weight:500;" type="text" name="name"> <br></H2> 
 <input style="font-size:20px;color:BLACK;position:absolute;left:680px;top:480px;font-weight:200;" type="submit" value="GO"> 
</form></div>
</body>
<style>
INPUT[TYPE=TEXT]{
border:2px solid red;
border-radius:4px;
}
.d4{position: absolute;
   border-radius: 10%;
top:200px;
left:1210px;
border: 4px solid #000040; 
height: 300px;
  width: 250px;
  background-color:blue;
  } 
  input[type=button], input[type=submit] { background-color: WHITE; border: none; color: BLACK; padding: 15px 30px; text-decoration: none; margin: 4px 2px; cursor: pointer; }
  .d5{
position: absolute;
 top:0px;
left:0px;
height: 100%;
border: 4px solid #000040; 
  width: 100%;
  background-image:linear-gradient(white,blue);
  }</style>
</html>