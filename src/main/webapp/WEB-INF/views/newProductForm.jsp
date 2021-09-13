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
        <div class="mt-4 mb-4" align="center">
          <h4><spring:message code="lbl.page" text="Add New Product" /></h4>
        </div>
        <div class="rows mt-4">
          <div class="col-md-6 m-auto">
            <div class="card">
              <div class="card-body">
                 <form action="/save-product" method="post" >
                    <div class="form-group">
                    <label for="name" class="label-control">PRODUCT NAME</label>
                    <input type="text" id="name" name="name" class="form-control" placeholder="Enter product name here" required="required"/>
                    </div>
                    <div class="form-group">
                      <label for="price" class="label-control">PRODUCT PRICE</label>
                      <input type="text" id="price" name="price" class="form-control" placeholder="Enter product price here" required="required"/>
                    </div>
                    <div class="form-group">
                        <label for="isStock" class="label-control">IS STOCK</label>
                        <input type="checkbox" id="isStock" name="isStock" />
                    </div>
                    <div class="form-group">
                        <label for="description" class="label-control">PRODUCT DESCRIPTION</label>
                        <textarea name="description" id="description" rows="3" class="form-control" placeholder="Enter your description here" cols=""></textarea>
                    </div>
                    <div class="form-group">
                       <label for="madeIn" class="label-control">MADE IN</label>
                       <input type="text" id="madeIn" name="madeIn" class="form-control" placeholder="Exemple : Senegal" required="required"/>
                    </div>
                    <div class="form-group">
                       <label for="brand" class="label-control">BRAND</label>
                       <input type="text" id="brand" name="brand" class="form-control" placeholder="brand ......" required="required"/>
                    </div>
                    <div class="form-group">
                        <label for="imageUrl" class="label-control">IMAGE URL</label>
                        <input type="text" id="imageUrl" name="imageUrl" class="form-control" placeholder="https://cdn.pixabay.com/photo/2014/09/24/14/29/macbook-459196__340.jpg" required="required"/>
                    </div>
                    <div>
                      <button type="submit" class="btn btn-success">SAVE PRODUCT</button>
                    </div>
                 </form>
              </div>
            </div>
          </div>
        </div>
   </div>
</section>

<%@ include file="../common/footer.jsp.jspf" %>