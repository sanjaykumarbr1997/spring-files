<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.5">
    <title>User Registration</title>
    <h3 style="color: White; font-size: xx-large;"> Welcome to Saavn </h3>
    <h3 style="color: White; font-size: medium;">${ msg }</h3>
   
    <style>

        body{
            background-image: url('https://149367133.v2.pressablecdn.com/wp-content/uploads/2018/03/Saavn-Logo.jpg');
        }
        .flex-container {
          display: flex;
          justify-content: center;
          opacity: 0.8;
         
          
         
        }
        
        .flex-container > div {
          
          background-color:#e6e600;
          border-style: groove;
          padding: 20px 44px 50px 33px;
        }
        input{
            font-family: serif;
            
        }
       label{
         font-weight: 900;
         font-size: x-large;
         
        
       }
        </style>
</head>
<body >
    <div class="flex-container">
        <div>
            <h3 style="color: #000066; font-size: xx-large;" > USER REGISTRATION</h3>
    <form action="registration" method="post">
     
        <pre>
    
   
        
        <label>Name </label>                            <input type="text" name="name">
        
        <label>Surname</label>                         <input type="text" name="surName">
        
        <label>Date Of Birth</label>                <input type="date" name="dateOfBirth">
        
        <label>E-mail Id </label>                    <input type="email" name="emailId">
        
        <label>Login Id</label>                       <input type="text" name="loginId">
        
        <label>Password</label>                       <input class="password" type="password" name="password">
        
        <label>Confirm Password</label>           <input class="confirmPassword" type="password" name="confirmPassword">
        
                                   <input  class ="submit" type="submit" value="Register"> <input type="reset" value="Clear">
        </pre>
        </form>

        </div>
        </div>

        <script>
            document.querySelector('.submit').onclick = function(){

                var password = document.querySelector('.password').value,
                 confirmPassword = document.querySelector('.confirmPassword').value;

                 if(password == ""){
                     alert('Field cant be empty');
                     return false;
                 }
                 else if(password!=confirmPassword){
                     alert('Password didnt match ..try again');
                     return false;

                 }
                 else if(password==confirmPassword){
                     
                     return true;
                 }

            }
        </script>
    
</body>
</html>