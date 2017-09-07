<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form Person Page</title>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body>

   <form id="form-person">
       <table>
           <tr>
               <td>Id Person</td>
               <td><input type="number" name="id" id="id" placeholder="Id Person"/></td>
               <td id="error-id"></td>
           </tr>
           <tr>
               <td>Nama Person</td>
               <td><input type="text" name="nama" id="nama" placeholder="Nama Person"/></td>
               <td id="error-nama"></td>
           </tr>
           <tr>
               <td>&nbsp;</td>
               <td><input type="submit" value="Submit Data Person"/></td>
           </tr>
       </table>
   </form>




</body>
<script>
    $(document).ready(function(){
        $('#form-person').submit(function(){
           var id = $('#id').val();
           var nama = $('#nama').val();



            if(id==='' || nama === ''){
               if(id===''){
                 $('#error-id').text('Id Person masih kosong');
               }else{
                 $('#error-id').text('');
               }

               if(nama===''){
                 $('#error-nama').text('Nama Person masih kosong');
               }else{
                 $('#error-nama').text('');
               }

               event.preventDefault();
            }else{
               $('#form-person').attr('method','POST');
               $('#form-person').attr('action','/arief/person/form');
            }

        });
    });
</script>


</html>
