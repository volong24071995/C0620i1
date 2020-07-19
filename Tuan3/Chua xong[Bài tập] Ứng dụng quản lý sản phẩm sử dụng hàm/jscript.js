let producname = ["OPPO A92", "iPhone 11 128GB", "Xiaomi Redmi Note 8 Pro", "OPPO A52", "Samsung Galaxy A51", "Realme 6i", " Vsmart Star 3", "iPhone 11 Pro Max 512GB"];
let htmlElement = "";
for (let i = 0; i < producname.length; i++) {
    htmlElement += `
    <tr>
    <td class="namepro">${producname[i]}</td>
    <td><button onclick="edit(producname,${i})">Edit</button></td>
    <td><button onclick="xoa(producname,${i})">Delete</button></td>
    </tr>
    `;
}
document.getElementById('container3').innerHTML = htmlElement;
function add() {
    let htmlElement1 = "";
    let x = document.getElementById("tao").value;
    if (x === "") {
        alert("Chưa nhập nameproduct");
    }
    else {
        let dsai = false;
        for (let i = 0; i < producname.length; i++) {
            if (x === producname[i]) {
                dsai = true;
                break;
            }
        }
        if (dsai) {
            alert("Đã trùng tên")
            document.getElementById("tao").value = "";
        }
        else {
            producname.push(x);
            document.getElementById("tao").value = "";
            for (let i = 0; i < producname.length; i++) {
                htmlElement1 += `
                <tr>
                 <td>${producname[i]}</td>
                <td><button onclick="edit(producname,${i})">Edit</button></td>
                <td><button onclick="xoa(producname,${i})">Delete</button></td>
                </tr>
                `;
            }
            document.getElementById('container3').innerHTML = htmlElement1;
        }
    }
}
// ham xoa
function xoa(producname, a) {
    producname.splice(a, 1)
    htmlElement2 = ""
    for (let i = 0; i < producname.length; i++) {
        htmlElement2 += `
        <tr>
         <td>${producname[i]}</td>
        <td><button onclick="edit(producname,${i})">Edit</button></td>
        <td><button onclick="xoa(producname,${i})">Delete</button></td>
        </tr>
        `;
    }
    document.getElementById('container3').innerHTML = htmlElement2;
}
// ham edit
let currentId = null;
function edit(producname, b) {
    document.getElementById("liem").value = producname[b];
    currentId = b;
}
function capnhat() {
    let dsai1 = false;
    let pro = document.getElementById("liem").value;
    for (let i = 0; i < producname.length; i++) {
        if (pro === producname[i]) {
            dsai1 = true
            break;
        }
    }
    if (dsai1) {
        alert("Đã trùng tên");
    }
    else {
        producname[currentId] = document.getElementById("liem").value;
        document.getElementById("liem").value = "";
        htmlElement3 = "";
        for (let i = 0; i < producname.length; i++) {
            htmlElement3 += `
        <tr>
         <td>${producname[i]}</td>
        <td><button onclick="edit(producname,${i})">Edit</button></td>
        <td><button onclick="xoa(producname,${i})">Delete</button></td>
        </tr>
        `;
        }
        document.getElementById('container3').innerHTML = htmlElement3;
    }
}
