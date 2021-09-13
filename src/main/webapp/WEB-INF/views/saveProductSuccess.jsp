<%@include file="../common/header.jsp.jspf"%>  

<%@include file="../common/navBar.jsp.jspf"%>

<style>
  body {
         color: #566787;
         background: #f5f5f5;
         font-family: 'Varela Round', sans-serif;
         font-size: 13px;
        }
</style>

<section>
   <div class="container">
        <div class="mt-4" align="center">
          <h4><spring:message code="lbl.page" text="Save success" /></h4>
        </div>
        <div class="rows">
          <div class="col-md-8 m-auto">
            <div class="card">
              <div class="card-body">
                 <div class="alert alert-success" role="alert">
                      ${ successMessage }
                 </div>
              </div>
            </div>
          </div>
        </div>
   </div>
</section>

<%@ include file="../common/footer.jsp.jspf" %>