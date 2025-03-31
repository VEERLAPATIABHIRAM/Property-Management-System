document.addEventListener("DOMContentLoaded", function () {
    const btn = document.querySelector(".btn");
    btn.addEventListener("mouseover", function () {
        btn.style.boxShadow = "0 0 10pxrgb(7, 7, 7)";
    });

    btn.addEventListener("mouseout", function () {
        btn.style.boxShadow = "none";
    });
});
