package edu.solid.liskov;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class PointsTests {

	private final Point2D reference = new Point2D(3,5);

	private final List<Point2D> testPoints = Arrays.asList(
			new Point2D(2,3),
			new Point2D(3,5),
			new Point2D(4,3)
	);

	private final Point2D reference3d = new Point3D(3,5, 7);

	private final List<Point2D> testPoints3d = Arrays.asList(
			new Point3D(2,3, 4),
			new Point3D(3,5, 7),
			new Point3D(3,5, 8)
	);
	
	@Test
	public void test_equal_if_only_if_dinstance_0() {
		for (Point2D point: testPoints) {
			Assert.assertEquals("test for " + reference + " and " + point,
					             reference.equals(point), 
					             reference.distance(point) == 0);
		}
	}

	@Test
	public void test_equal_if_only_if_dinstance_0_3D() {
		for (Point2D point: testPoints3d) {
			Assert.assertEquals("test for " + reference3d + " and " + point,
					reference3d.equals(point),
					reference3d.distance(point) == 0);
		}
	}

}
