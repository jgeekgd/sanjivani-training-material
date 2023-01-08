# https://medium.com/analytics-vidhya/explore-your-recursive-sql-query-f15b120e518e
# Check Query output windows on right scroll to see Execution Plan.

WITH RECURSIVE top_down_cte AS(
	SELECT Stream, COUNT(STREAM) as Total
	FROM gd_flipkart.gd_batch
	WHERE STREAM IS NOT NULL
	GROUP BY Stream
	HAVING Total>1
	ORDER BY 2
)SELECT * FROM top_down_cte;