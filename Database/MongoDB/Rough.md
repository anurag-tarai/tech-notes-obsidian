```json
// User
{
	'_id':ObjectId(...),
	'name': 'Anurag Tarai',
	'addressId': ObjectId(...) ,
	'OrderId' : [1,2,3]
}

// Order
{
	'_id':ObjectId(...),
	'userId': ObjectId(...)
	'items' : [1,2,3]
}

// Items
{
	'_id':1,
	'productId': ObjectId(...),
	'price' : 350,
	'quantity' : 245
}

// Queries
1. db.user.find({_id:ObjectId(...)})
2. 
3. 

```