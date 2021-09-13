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
          <h4><spring:message code="lbl.page" text="Add New Category Product" /></h4>
        </div>
        <div class="rows mt-4">
          <div class="col-md-6 m-auto">
            <div class="card">
              <div class="card-body">
                 <form action="/save-category" method="post" >
                    <div class="form-group">
                    <label for="name" class="label-control">PRODUCT CATEGORY NAME</label>
                    <input type="text" id="name" name="name" class="form-control" required="required" autofocus="autofocus"/>
                    </div>
                    <div class="form-group">
                      <label for="imageUrl" class="label-control">PRODUCT IMAGE URL</label>
                      <input type="text" id="imageUrl" name="imageUrl" class="form-control" placeholder="https://cdn.pixabay.com/photo/2015/01/20/12/51/mobile-605422__340.jpg" required="required"/>
                    </div>
                    <div class="form-group">
                        <label for="description" class="label-control">PRODUCT CATEGORY DESCRIPTION</label>
                        <textarea name="description" id="description" rows="4" class="form-control" placeholder="Enter your description here" cols="" required="required"></textarea>
                    </div>
                    <div>
                      <button type="submit" class="btn btn-success">SAVE</button>
                    </div>
                 </form>
              </div>
            </div>
          </div>
        </div>
   </div>
</section>

<%@ include file="../common/footer.jsp.jspf" %>