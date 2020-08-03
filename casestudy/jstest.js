let myIndex = 0;
carousel();

function carousel() {
    var i;
    var x = document.getElementsByClassName("mySlides");
    for (i = 0; i < x.length; i++) {
        x[i].style.display = "none";
    }
    myIndex++;
    if (myIndex > x.length) { myIndex = 1 }
    x[myIndex - 1].style.display = "block";
    setTimeout(carousel, 3000); // Change image every 3 seconds
}
// sản phẩm mới ,tiêu đề và giá:
let price = ["Liên hệ để nhận báo giá", "Liên hệ để nhận báo giá", "36.000 VNĐ", "14.300 VNĐ", "14.500 VNĐ", "498.000 VNĐ", "Liên hệ để nhận báo giá", "287.000 VNĐ"]
let imgnew = ["sp1.jpg", "sp2.jpg", "sp3.jpg", "sp4.jpg", "sp5.jpg", "sp6.jpg", "sp7.jpg", "sp8.jpg"];
let
    a1 = "Dung dịch sát khuẩn tay dạng gel (1 chai)",
    a2 = "Dung dịch sát khuẩn tay Alfasept Handrub Lavitec (500ml/chai)",
    a3 = "Băng dính cá nhân y tế UGOTANA cho Gia đình (10 vỉ/hộp, 10 miếng/vỉ)",
    a4 = 'Băng dính cá nhân y tế UGOTANA (COMBO) (Hộp 10 bông tăm tấm Povidone-Iodine+09 Băng nhỏ + 03 băng to 200 hộp / kiện)',
    a5 = "Khăn gói tiệt trùng Halyard (Túi)",
    a6 = "Túi ép Tyvek KMN (1 cuộn)",
    a7 = "Túi hấp tiệt trùng",
    a8 = "Túi ép phồng KMN (1 cuộn)";
let title = [a1, a2, a3, a4, a5, a6, a7, a8];
let html = "",
    html1 = "";
for (let i = 0; i < imgnew.length; i++) {
    html +=
        ` <div class="row">
      <a href="#"><img src ="bansanpham/spmoi/${imgnew[i]}" ></a>
      <p><a href="#">${title[i]}</a></p>
      <p class="price">${price[i]}</p>
      <div class="buy">
        <button>Mua hàng</button>
      </div>
      </div > `
}
document.getElementById("newproduct").innerHTML = html;
// sản phẩm nổi bật tiêu đề giá:
let pricehot = ["260.000 VNĐ", "287.000 VNĐ", "4.500 VNĐ"]
let imghot = ["spnb1.jpg", "spnb2.jpg", "spnb3.jpg"];
let
    b1 = "Bộ gây tê ngoài màng cứng Perifix 421 Complete set (1 bộ)",
    b2 = "Túi ép phồng KMN (1 cuộn)",
    b3 = "Bơm cho ăn MPV (1 cái)";
let titlehot = [b1, b2, b3]
for (let i = 0; i < imghot.length; i++) {
    html1 +=
        `<div class="row">
  <a href="#"><img src ="bansanpham/spnoibat/${imghot[i]}" ></a>
  <p><a href="#">${titlehot[i]}</a></p>
  <p class="price">${pricehot[i]}</p>
  <div class="buy">
    <button>Mua hàng</button>
  </div>
  </div >`
}
document.getElementById("hotproducts").innerHTML = html1;

// tim kiem san pham
let makettitle = [a1, a2, a3, a4, a5, a6, a7, a8, b1, b2, b3],
    maketimg = ["sp1.jpg", "sp2.jpg", "sp3.jpg", "sp4.jpg", "sp5.jpg", "sp6.jpg", "sp7.jpg", "sp8.jpg", "spnb1.jpg", "spnb2.jpg", "spnb3.jpg"],
    maketinfor = ["infor-a1", "infor-a2", "infor-a3", "infor-a4", "infor-a5", "infor-a6", "infor-a7", "infor-a8", "infor-b1", "infor-b2", "infor-b3"];

function search() {
    let text = document.getElementById("timhang").value;
    document.getElementById("timhang").value = "";
    if (text === "") {
        alert("Bạn cần gì??");
    } else {
        let array = text.split(" ");
        while (array[0] === "") {
            array.shift(array[0]);
        }
        while (array[array.length - 1] === "") {
            array.pop(array[0]);
        }
        text = "";
        for (let i = 0; i < array.length - 1; i++) {
            if (array[i] != "") {
                text += (array[i] + " ");
            }
        }
        text += array[array.length - 1];
        document.getElementById("slider").style.height = 0 + "px";
        document.getElementById("slider").style.width = 0 + "px";
        let check = [];
        for (let i = 0; i < makettitle.length; i++) {
            if (makettitle[i].indexOf(text) != -1) {
                check.push(i);
                console.log(check);
            }
        }
        let html3 = "";
        if (check.length >= 1) {
            for (let i = 0; i < check.length; i++) {
                let x = check[i];
                console.log(x);
                html3 +=
                    `<div class="imgsearch">
        <img src="./bansanpham/maket/${maketimg[x]}" >
        </div>
        <div class="infosearch">
        <img src="./inforsp/${maketinfor[x]}.GIF" >
        </div>`
            }
            document.getElementById("result").innerHTML = html3;
        } else
            document.getElementById("result").innerHTML =
            `<span class='nosearch'>Không tìm thấy sản phẩm......</span> 
        <hr style="margin-top:2em">`;
    }
    event.preventDefault();
}
// nha phan phoi
let name = ["AGFA.png", "ANPHU.png", "AURORA.png", "BAOTHACH.png", "BBRAUN.png", "DANAMECO-1.png", "GREETMED.png", "HONGTHIENMY.png", "MPV.png", "NIPRO.png", "OMIGA.png", "SIEMENS-1.png", "SMITHSMEDICAL-1.png", "TANAPHAR-1.png", "TERUMO-1.png", "VGLOVE-1.png", "VIHANMEDICO-1.png", "WELFORD-1.png", "WELLMED-1.png"];
let html2 = "";
for (let i = 0; i < name.length; i++) {
    html2 += `<img src="./anhnhaphanphoi/${name[i]}" width="200px" height="100px" style="border: 1px solid black; margin-left: 5px;margin-top:10px">`
}
document.getElementById("div7-1").innerHTML = html2;