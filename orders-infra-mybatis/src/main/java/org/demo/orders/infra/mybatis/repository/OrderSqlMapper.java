/*
 * Generated by Telosys ( https://www.telosys.org/ )
 * 2022-04-12 (15:12:15)
 */
package org.demo.orders.infra.mybatis.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.demo.orders.domain.model.Order;
import org.demo.orders.domain.model.OrderItem;
import org.demo.orders.infra.mybatis.common.SqlMapper;

@Mapper
public interface OrderSqlMapper extends SqlMapper<Order, Integer> {


    static final String TABLE = "\"order\"";

	//----------------------------------------------------------------
	// Standard methods implementation 
	//----------------------------------------------------------------
	@Override
	@Select("SELECT COUNT(*) FROM " + TABLE)
	long count();


	@Override
	@Select("SELECT * FROM " + TABLE  +
			" WHERE num = #{num} " )
	@Results(id="OrderResults", value = {
			@Result(property = "items", 
					many = @Many(select = "findItems"),
					column = "{param1=num}")
			})
	Order findById(Integer id);


	@Override
    @Select("SELECT * FROM " + TABLE + " ORDER BY ${sort} ${order} LIMIT ${limit} OFFSET ${offset}")
	@ResultMap("OrderResults") // reuse the same "result map" as defined in "findById"
	List<Order> findAll(@Param("offset") Integer offset, @Param("limit") Integer limit,
								  @Param("sort")   String sort,    @Param("order") String order);

	@Override
	@Insert("INSERT INTO " + TABLE + "( " +
			"num, order_date, status, comment, customer_id" +
			" ) VALUES ( " +
			"#{num}, #{orderDate}, #{status}, #{comment}, #{customerId}" +
			")")
	int insert(Order order);

	@Override
	@Update("UPDATE " + TABLE + 
			" SET " +
			" order_date = #{orderDate}, " +
			" status = #{status}, " +
			" comment = #{comment}, " +
			" customer_id = #{customerId} " +
			" WHERE num = #{num}" )
	int update(Order order);

	@Override
	@Delete("DELETE FROM " + TABLE + 
			" WHERE num = #{num}" )
	int delete(Order order);

	//----------------------------------------------------------------
	// Methods for link "items" ( @Many relationship )
	//----------------------------------------------------------------	
	@Select("SELECT * FROM  " +
	// TODO : set column name
			" WHERE xxx = #{param1}")
	List<OrderItem> findOrderItemList(Integer num);

	@Delete("DELETE FROM  " +
	// TODO : set column name
			" WHERE xxx = #{param1}")
	void deleteOrderItemList(Integer num);
	@Insert({ "<script>",
			"INSERT INTO  (",
			"id, order_num, product_code, quantity, unit_price, discount, comment",
			")",
			"VALUES ", 
			"<foreach item='o' collection='list' separator=','>",
			"(",
			"#{o.id}, #{o.orderNum}, #{o.productCode}, #{o.quantity}, #{o.unitPrice}, #{o.discount}, #{o.comment}",
			")",
			"</foreach>", 
			"</script>" })
	void insertOrderItemList(List<OrderItem> list);


	//----------------------------------------------------------------
	// Ajouter ici les méthodes spécifiques 'findByXxx', 'countByXxxx', etc
	//----------------------------------------------------------------
/***
	@Select("SELECT * FROM " + TABLE +
			" WHERE xxx = #{xxx} ORDER BY ${sort} ${order} OFFSET ${offset} LIMIT ${limit}")
	@ResultMap("OrderResults") // reuse the same "result map" as defined in "findById"
	List<Order> findByXxxx(
			@Param("xxx") int xxx, 
			@Param("offset") Integer offset,
			@Param("limit") Integer limit, 
			@Param("sort") String sort, 
			@Param("order") String order);

	@Select("SELECT COUNT(*) FROM " + TABLE + " WHERE xxx = #{param1}")
	long countByXxxx(int xxx);
***/
}
