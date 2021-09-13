<%@include file="../common/header.jsp.jspf"%>  

<style>
body{

     color: #566787;
     background: #f5f5f5;
     font-family: 'Varela Round', sans-serif;
     font-size: 13px;
}

</style>

<section>
	<div class="container">
		<div class="rows mt-5">
		   <div align="center" class="mt-4">
		     <h1>Log In Now</h1>
		   </div> 
		   <h4 align="center" style="color:red;">${ errorMessage }</h4> 
		   <div class="col-md-6 m-auto">
		       <div class="card mt-5">
		          <div class="card-body">
		             <form action="/save-login" method="post">
		                <div class="form-group">
		                   <label for="username">Username</label>
		                   <input type="text" id="username" name="username" class="form-control" required="required" autofocus="autofocus">
		                </div>
		                <div class="form-group">
		                   <label for="password">Password</label>
		                   <input type="password" id="password" name="password" class="form-control" required="required">
		                </div>
		                <div class="form-group">
		                   <button type="submit" class="btn btn-success">Log In</button>
		                </div>
		             </form>
		          </div>
		       </div>
		   </div>
		</div>
	</div>
</section>
