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
        <div class="mt-4" align="center">
          <h4><spring:message code="lbl.page" text="Add New Product" /></h4>
        </div>
        <div class="rows">
          <div class="col-md-8 m-auto">
            <div class="card">
              <div class="card-body">
                 <form:form action="/save-product" method="post" modelAttribute="product">
                    <div class="form-group">
                       <spring:message code="lbl.name" text="Product Name" />
                       <form:input path="name" class="form-control"/>
                       <form:errors path="name" cssClass="error" />
                    </div>
                    <div class="form-group">
                       <spring:message code="lbl.price" text="Product Price" />
                       <form:input path="price" class="form-control" />
                       <form:errors path="price" cssClass="error" />
                    </div>
                    <div class="form-group">
                       <spring:message code="lbl.stock" text="Is Stock" />
                       <form:checkbox path="stock" />
                    </div>
                    <div class="form-group">
                       <spring:message code="lbl.madeIn" text="Made In" />
                       <form:input path="madeIn" class="form-control" />
                       <form:errors path="madeIn" cssClass="error" />
                    </div>
                    <div class="form-group">
                       <spring:message code="lbl.brand" text="Brand" />
                       <form:input path="brand" class="form-control" />
                       <form:errors path="brand" cssClass="error" />
                    </div>
                    <div class="form-group">
                       <spring:message code="lbl.imageUrl" text="Image Url" />
                       <form:input path="imageUrl" text="salut" class="form-control" />
                       <form:errors path="imageUrl" cssClass="error" />
                    </div>
                    <div class="form-group">
                       <spring:message code="lbl.description" text="Product Description" />
                       <form:textarea path="description" class="form-control" />
                       <form:errors path="description" cssClass="error" />
                    </div>
                    <div>
                      <button type="submit" class="btn btn-success">SAVE PRODUCT</button>
                    </div>
                 </form:form>
              </div>
            </div>
          </div>
        </div>
   </div>
</section>

<%@ include file="../common/footer.jsp.jspf" %>