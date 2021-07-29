<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.5">
    <title>User Registration</title>
    <h3 style="color: White; font-size: xx-large;"> Welcome to Passport Seva </h3>
    <h3 style="color: White; font-size: medium;">${ msg }</h3>
   
    <style>

        body{
            background-image: url('https://www.guideconsultants.com/wp-content/uploads/2021/02/India-passport-1-scaled.jpg');
        }
        .flex-container {
          display: flex;
          justify-content: center;
          opacity: 0.8;
         
          
         
        }
        
        .flex-container > div {
          
          background-color: white;
          border-style: groove;
          padding: 20px 44px 150px 33px;
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
<body bgcolor="grey">
    <div class="flex-container">
        <div>
            <h3 style="color: black; font-size: xx-large;" > USER REGISTRATION</h3>
    <form action="registration.all" method="post">
     
        <pre>
    
        <label>Register to apply at</label>     <input type ="radio" name = "office" value="CPV Delhi">CPV Delhi
                                            <input type ="radio" name = "office" value="Passport Office" checked>Passport Service
        
        <label>Office</label>                           <select name="selectLocation">
                                          <option value="Bangalore">Bangalore</option>
                                          <option value="Mysore">Mysore</option>
                                          <option value="Hyderabad">Hyderabad</option>
        </select>
        
        <label>Given Name </label>                   <input type="text" name="givenName">
        
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