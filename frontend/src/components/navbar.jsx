import { Link } from "react-router-dom";

function Navbar() {
  return (
    <nav style={{ padding: "15px", background: "#333", color: "white" }}>
      <h2>TravelX</h2>
      <div>
        <Link to="/" style={{ margin: "10px", color: "white" }}>Home</Link>
        <Link to="/destinations" style={{ margin: "10px", color: "white" }}>Destinations</Link>
        <Link to="/contact" style={{ margin: "10px", color: "white" }}>Contact</Link>
      </div>
    </nav>
  );
}

export default Navbar;