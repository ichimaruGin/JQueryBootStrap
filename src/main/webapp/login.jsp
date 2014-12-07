<%@include file="header.jsp" %>
<div class="container">
      <form class="form-signin" role="form" action="<%=request.getContextPath()%>/login/<%=System.currentTimeMillis()%>" method="post">
        <h2 class="form-signin-heading">Please sign in</h2>
        <input type="email" class="form-control"  	placeholder="Email address" name="email" required autofocus>
        <input type="password" class="form-control" placeholder="Password" name="password" required>
        <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> Remember me
          </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
      </form>
 </div> <!-- /container -->
    
<p>${login}</p>
<script>
	$(document).ready(function(){
		$("button").click(function(){
			$("p").hide();
		});
	});
</script>

<%@include file="footer.jsp"%>