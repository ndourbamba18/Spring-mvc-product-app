<%@include file="../common/header.jsp.jspf"%>  

<%@include file="../common/navBar.jsp.jspf"%>

<style>
  body {
         color: #566787;
         background: #f5f5f5;
         font-family: 'Varela Round', sans-serif;
         font-size: 13px;
        }
        
  .error 
    {
        color: #ff0000;
        font-weight: bold;
    }
</style>

<section>
   <div class="container">
        <div class="mt-5" align="center">
          <h4><spring:message code="lbl.page" text="Update Category Product" /></h4>
        </div>
        <div class="rows mt-5 mb-5">
          <div class="col-md-8 m-auto">
            <div class="card">
              <div class="card-body">
                 <form:form action="/save-update-category" method="post" modelAttribute="category">
                    <div class="form-group">
                       <spring:message code="lbl.name" text="Category Name" />
                       <form:input path="name" class="form-control"/>
                       <form:errors path="name" cssClass="error" />
                    </div>
                    <div class="form-group">
                       <spring:message code="lbl.imageUrl" text="Category image url" />
                       <form:input path="imageUrl" class="form-control" />
                       <form:errors path="imageUrl" cssClass="error" />
                    </div>
                    <div class="form-group">
                       <spring:message code="lbl.description" text="Category Description" />
                       <form:textarea path="description" class="form-control" />
                       <form:errors path="description" cssClass="error" />
                    </div>
                    <div>
                      <button type="submit" class="btn btn-primary">UPDATE</button>
                    </div>
                 </form:form>
              </div>
            </div>
          </div>
        </div>
   </div>
</section>

<%@ include file="../common/footer.jsp.jspf" %>