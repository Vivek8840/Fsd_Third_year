import { useNavigate } from "react-router-dom";
import { Card, CardContent, Typography, Button } from "@mui/material";

function DestinationCard({ place }) {
  const navigate = useNavigate(); // ✅ inside component

  return (
    <Card
      sx={{
        maxWidth: 300,
        borderRadius: 3,
        boxShadow: 3,
        cursor: "pointer",
      }}
    >
      <img
        src={place.image}
        alt={place.name}
        style={{ width: "100%", height: "180px", objectFit: "cover" }}
      />

      <CardContent>
        <Typography variant="h6">{place.name}</Typography>

        <Button
          variant="contained"
          sx={{ marginTop: 2 }}
          onClick={() => navigate(`/destination/${place.name}`)}
        >
          Book Now
        </Button>
      </CardContent>
    </Card>
  );
}

export default DestinationCard;