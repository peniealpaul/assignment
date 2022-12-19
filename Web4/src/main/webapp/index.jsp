<HTML>
<head>
<TITLE>
GAME
</TITLE>
</HEAD>
<BODY>
GUSEE FOUR NUMBER
<body>
<div class="d5"></div>
<h1 style="font-size:40px;color:BLACK;position:absolute;left:500px;top:100px;font-weight:500;">TRY TO GUESS ${inf4}</h1>
<form action="/check">
 <div class="d1"><H3 style="position:absolute;left:90px;top:15px">NO-1</H3><input type="number" name="no1" class ="te" size ="10"> <br><h2> ${info.no1} </h2></div>
 <div class="d2"><H3 style="position:absolute;left:90px;top:15px">NO-2</H3><input type="number" name="no2" class ="te" size ="10"> <br><h2> ${info.no2} </h2></div>
 <div class="d3"><H3 style="position:absolute;left:90px;top:15px">NO-3</H3><input type="number" name="no3" class ="te" size ="10"> <br><h2> ${info.no3} </h2></div>
 <div class="d4"><H3 style="position:absolute;left:90px;top:15px">NO-4</H3><input type="number" name="no4" class ="te" size ="10"> <br><h2> ${info.no4} </h2></div>
 <input type="submit"> 
</form>
 </body>
<style>
.d1{
position: absolute;
 border-radius: 10%;
 border: 4px solid #000040; 
 top:200px;
left:100px;
height: 300px;
  width: 250px;
  background-image:linear-gradient(BLUE,WHITE);
  }
  
 .d2{position: absolute;
  border-radius: 10%;
top:200px;
left:470px;
border: 4px solid #000040; 
height: 300px;
  width: 250px;
  background-image:linear-gradient(BLUE,WHITE);
  }
  .d3{position: absolute;
   border-radius: 10%;
top:200px;
left:840px;
border: 4px solid #000040; 
height: 300px;
  width: 250px;
  background-image:linear-gradient(BLUE,WHITE);
  }
  .d4{position: absolute;
   border-radius: 10%;
top:200px;
left:1210px;
border: 4px solid #000040; 
height: 300px;
  width: 250px;
  background-image:linear-gradient(BLUE,WHITE);
  } 
  .d5{
position: absolute;
 top:0px;
left:0px;
height: 100%;
border: 4px solid #000040; 
  width: 100%;
  background-image:linear-gradient(white,BLUE);
  }
.te{
position: absolute;
 

  width: 100%;
  
  }
  input[type=number]{
  top:50px;
left:50px;
 padding:50px;
  height:150px;
outline:none;
 border:none;
 background:transparent;
 overflow:hidden;
  
  font-size:70px;
  
  }
  </style></html>
