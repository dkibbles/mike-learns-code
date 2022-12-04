const nav = document.querySelector("header nav ul");
const navButton = document.querySelector(".nav-button");

navButton.addEventListener("click", () => {
    const vis = nav.getAttribute("data-visable");

    if (vis === "false") {
        nav.setAttribute("data-visable", true);
        navButton.setAttribute("aria-expanded", true);
    } else {
        nav.setAttribute("data-visable", false);
        navButton.setAttribute("aria-expanded", false);
    }
});