package net.sinclairstudios.example;

import net.sinclairstudios.example.s5classes.Coupon;
import net.sinclairstudios.example.s5classes.FlightSegment;
import net.sinclairstudios.example.s5classes.Segment;
import net.sinclairstudios.example.s5classes.Status;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class S8AnExampleFromGetBooking {

  public static void main(String... args) {

    Collection<Coupon> coupons = new ArrayList<>();
    Collection<Segment> segments = new ArrayList<>();

    for (Coupon coupon : coupons)
    {
      if (Status.VoidCp != coupon.getStatus())
      {
        for (Segment segment : segments)
        {
          if (segment.isFlight())
          {
            FlightSegment flightSegment = (FlightSegment) segment;
            if (coupon.matchesFlightSegment(flightSegment))
            {
              coupon.addFlightSegment(flightSegment);
            }
          }
        }
      }
    }
  }
}
