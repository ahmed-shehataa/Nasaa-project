package com.ashehata.nasaproject.netwok
import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName


/**
 * TODO
 */
@Keep
data class MyResponse(
    @SerializedName("element_count")
    val elementCount: Int? = 0, // 25
    @SerializedName("links")
    val links: Links? = Links(),
    @SerializedName("near_earth_objects")
    val nearEarthObjects: NearEarthObjects? = NearEarthObjects()
) {
    @Keep
    data class Links(
        @SerializedName("next")
        val next: String? = "", // http://www.neowsapp.com/rest/v1/feed?start_date=2015-09-08&end_date=2015-09-09&detailed=false&api_key=hXe4m2kjtxxyKZdfn4V2kP5uiseTPDqaUiiQrFDE
        @SerializedName("prev")
        val prev: String? = "", // http://www.neowsapp.com/rest/v1/feed?start_date=2015-09-06&end_date=2015-09-07&detailed=false&api_key=hXe4m2kjtxxyKZdfn4V2kP5uiseTPDqaUiiQrFDE
        @SerializedName("self")
        val self: String? = "" // http://www.neowsapp.com/rest/v1/feed?start_date=2015-09-07&end_date=2015-09-08&detailed=false&api_key=hXe4m2kjtxxyKZdfn4V2kP5uiseTPDqaUiiQrFDE
    )

    @Keep
    data class NearEarthObjects(
        @SerializedName("2015-09-07")
        val x20150907: List<X20150907?>? = listOf(),
        @SerializedName("2015-09-08")
        val x20150908: List<X20150908?>? = listOf()
    ) {
        @Keep
        data class X20150907(
            @SerializedName("absolute_magnitude_h")
            val absoluteMagnitudeH: Double? = 0.0, // 19.3
            @SerializedName("close_approach_data")
            val closeApproachData: List<CloseApproachData?>? = listOf(),
            @SerializedName("estimated_diameter")
            val estimatedDiameter: EstimatedDiameter? = EstimatedDiameter(),
            @SerializedName("id")
            val id: String? = "", // 2440012
            @SerializedName("is_potentially_hazardous_asteroid")
            val isPotentiallyHazardousAsteroid: Boolean? = false, // false
            @SerializedName("is_sentry_object")
            val isSentryObject: Boolean? = false, // false
            @SerializedName("links")
            val links: Links? = Links(),
            @SerializedName("name")
            val name: String? = "", // 440012 (2002 LE27)
            @SerializedName("nasa_jpl_url")
            val nasaJplUrl: String? = "", // http://ssd.jpl.nasa.gov/sbdb.cgi?sstr=2440012
            @SerializedName("neo_reference_id")
            val neoReferenceId: String? = "" // 2440012
        ) {
            @Keep
            data class CloseApproachData(
                @SerializedName("close_approach_date")
                val closeApproachDate: String? = "", // 2015-09-07
                @SerializedName("close_approach_date_full")
                val closeApproachDateFull: String? = "", // 2015-Sep-07 07:32
                @SerializedName("epoch_date_close_approach")
                val epochDateCloseApproach: Long? = 0, // 1441611120000
                @SerializedName("miss_distance")
                val missDistance: MissDistance? = MissDistance(),
                @SerializedName("orbiting_body")
                val orbitingBody: String? = "", // Earth
                @SerializedName("relative_velocity")
                val relativeVelocity: RelativeVelocity? = RelativeVelocity()
            ) {
                @Keep
                data class MissDistance(
                    @SerializedName("astronomical")
                    val astronomical: String? = "", // 0.4981690972
                    @SerializedName("kilometers")
                    val kilometers: String? = "", // 74525035.840942964
                    @SerializedName("lunar")
                    val lunar: String? = "", // 193.7877788108
                    @SerializedName("miles")
                    val miles: String? = "" // 46307709.9545183432
                )

                @Keep
                data class RelativeVelocity(
                    @SerializedName("kilometers_per_hour")
                    val kilometersPerHour: String? = "", // 4187.1034988155
                    @SerializedName("kilometers_per_second")
                    val kilometersPerSecond: String? = "", // 1.1630843052
                    @SerializedName("miles_per_hour")
                    val milesPerHour: String? = "" // 2601.7032823612
                )
            }

            @Keep
            data class EstimatedDiameter(
                @SerializedName("feet")
                val feet: Feet? = Feet(),
                @SerializedName("kilometers")
                val kilometers: Kilometers? = Kilometers(),
                @SerializedName("meters")
                val meters: Meters? = Meters(),
                @SerializedName("miles")
                val miles: Miles? = Miles()
            ) {
                @Keep
                data class Feet(
                    @SerializedName("estimated_diameter_max")
                    val estimatedDiameterMax: Double? = 0.0, // 2691.6899315481
                    @SerializedName("estimated_diameter_min")
                    val estimatedDiameterMin: Double? = 0.0 // 1203.7603322587
                )

                @Keep
                data class Kilometers(
                    @SerializedName("estimated_diameter_max")
                    val estimatedDiameterMax: Double? = 0.0, // 0.8204270649
                    @SerializedName("estimated_diameter_min")
                    val estimatedDiameterMin: Double? = 0.0 // 0.3669061375
                )

                @Keep
                data class Meters(
                    @SerializedName("estimated_diameter_max")
                    val estimatedDiameterMax: Double? = 0.0, // 820.4270648822
                    @SerializedName("estimated_diameter_min")
                    val estimatedDiameterMin: Double? = 0.0 // 366.9061375314
                )

                @Keep
                data class Miles(
                    @SerializedName("estimated_diameter_max")
                    val estimatedDiameterMax: Double? = 0.0, // 0.5097895857
                    @SerializedName("estimated_diameter_min")
                    val estimatedDiameterMin: Double? = 0.0 // 0.2279848336
                )
            }

            @Keep
            data class Links(
                @SerializedName("self")
                val self: String? = "" // http://www.neowsapp.com/rest/v1/neo/2440012?api_key=hXe4m2kjtxxyKZdfn4V2kP5uiseTPDqaUiiQrFDE
            )
        }

        @Keep
        data class X20150908(
            @SerializedName("absolute_magnitude_h")
            val absoluteMagnitudeH: Double? = 0.0, // 20.36
            @SerializedName("close_approach_data")
            val closeApproachData: List<CloseApproachData?>? = listOf(),
            @SerializedName("estimated_diameter")
            val estimatedDiameter: EstimatedDiameter? = EstimatedDiameter(),
            @SerializedName("id")
            val id: String? = "", // 2465633
            @SerializedName("is_potentially_hazardous_asteroid")
            val isPotentiallyHazardousAsteroid: Boolean? = false, // true
            @SerializedName("is_sentry_object")
            val isSentryObject: Boolean? = false, // false
            @SerializedName("links")
            val links: Links? = Links(),
            @SerializedName("name")
            val name: String? = "", // 465633 (2009 JR5)
            @SerializedName("nasa_jpl_url")
            val nasaJplUrl: String? = "", // http://ssd.jpl.nasa.gov/sbdb.cgi?sstr=2465633
            @SerializedName("neo_reference_id")
            val neoReferenceId: String? = "" // 2465633
        ) {
            @Keep
            data class CloseApproachData(
                @SerializedName("close_approach_date")
                val closeApproachDate: String? = "", // 2015-09-08
                @SerializedName("close_approach_date_full")
                val closeApproachDateFull: String? = "", // 2015-Sep-08 20:28
                @SerializedName("epoch_date_close_approach")
                val epochDateCloseApproach: Long? = 0, // 1441744080000
                @SerializedName("miss_distance")
                val missDistance: MissDistance? = MissDistance(),
                @SerializedName("orbiting_body")
                val orbitingBody: String? = "", // Earth
                @SerializedName("relative_velocity")
                val relativeVelocity: RelativeVelocity? = RelativeVelocity()
            ) {
                @Keep
                data class MissDistance(
                    @SerializedName("astronomical")
                    val astronomical: String? = "", // 0.3027478814
                    @SerializedName("kilometers")
                    val kilometers: String? = "", // 45290438.204452618
                    @SerializedName("lunar")
                    val lunar: String? = "", // 117.7689258646
                    @SerializedName("miles")
                    val miles: String? = "" // 28142173.3303294084
                )

                @Keep
                data class RelativeVelocity(
                    @SerializedName("kilometers_per_hour")
                    val kilometersPerHour: String? = "", // 65260.6371983344
                    @SerializedName("kilometers_per_second")
                    val kilometersPerSecond: String? = "", // 18.1279547773
                    @SerializedName("miles_per_hour")
                    val milesPerHour: String? = "" // 40550.4220413761
                )
            }

            @Keep
            data class EstimatedDiameter(
                @SerializedName("feet")
                val feet: Feet? = Feet(),
                @SerializedName("kilometers")
                val kilometers: Kilometers? = Kilometers(),
                @SerializedName("meters")
                val meters: Meters? = Meters(),
                @SerializedName("miles")
                val miles: Miles? = Miles()
            ) {
                @Keep
                data class Feet(
                    @SerializedName("estimated_diameter_max")
                    val estimatedDiameterMax: Double? = 0.0, // 1652.0570096689
                    @SerializedName("estimated_diameter_min")
                    val estimatedDiameterMin: Double? = 0.0 // 738.8223552649
                )

                @Keep
                data class Kilometers(
                    @SerializedName("estimated_diameter_max")
                    val estimatedDiameterMax: Double? = 0.0, // 0.5035469604
                    @SerializedName("estimated_diameter_min")
                    val estimatedDiameterMin: Double? = 0.0 // 0.2251930467
                )

                @Keep
                data class Meters(
                    @SerializedName("estimated_diameter_max")
                    val estimatedDiameterMax: Double? = 0.0, // 503.5469604336
                    @SerializedName("estimated_diameter_min")
                    val estimatedDiameterMin: Double? = 0.0 // 225.1930466786
                )

                @Keep
                data class Miles(
                    @SerializedName("estimated_diameter_max")
                    val estimatedDiameterMax: Double? = 0.0, // 0.3128894784
                    @SerializedName("estimated_diameter_min")
                    val estimatedDiameterMin: Double? = 0.0 // 0.1399284286
                )
            }

            @Keep
            data class Links(
                @SerializedName("self")
                val self: String? = "" // http://www.neowsapp.com/rest/v1/neo/2465633?api_key=hXe4m2kjtxxyKZdfn4V2kP5uiseTPDqaUiiQrFDE
            )
        }
    }
}