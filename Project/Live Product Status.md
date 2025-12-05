### ✅ a. **Live Product Status**

Add a toggle to mark a product as _Active / Sold Out / Hidden_.  
Helps farmers temporarily hide products without deleting them.

``const toggleAvailability = async () => {   const updated = { ...product, available: !product.available };   await api.put(`/api/v1/products/${productId}`, updated, {     headers: { Authorization: `Bearer ${token}` },   });   setProduct(updated); };``

Button:

``<button   onClick={toggleAvailability}   className={`px-6 py-2 rounded-xl shadow-md transition duration-300 ${     product.available ? "bg-green-700 hover:bg-green-800" : "bg-red-700 hover:bg-red-800"   } text-white`} >   {product.available ? "Set as Sold Out" : "Set as Available"} </button>``