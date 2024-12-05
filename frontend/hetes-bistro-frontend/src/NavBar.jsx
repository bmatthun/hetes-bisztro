import { useEffect, useState } from "react";
import { useNavigate } from "react-router-dom";

function NavBar() {
  const nav = useNavigate();

  function handleAboutUs() {
    nav("/aboutus")
  }

  function handleServices() {
    nav("/services")
  }

  return  <div>
            <nav id="mainNav">
              <div>
                <button onClick={() => handleAboutUs()}>About us</button>
              </div>
              <div>
                <button onClick={() => handleServices()}>Services</button>
              </div>
            </nav>
          </div>
}

export default NavBar