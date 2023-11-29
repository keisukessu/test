/* sample6.js */
window.addEventListener("DOMContentLoaded", init);

function init() {
    const width = 500;
    const height = 500;
    let count = 0;
    // レンダラーを作成 
    const renderer = new THREE.WebGLRenderer({
        canvas: document.querySelector("#myCanvas")
    });
    renderer.setSize(width, height); /* ウィンドウサイズの設定 */
    renderer.setClearColor(0x000000); /* 背景色の設定 */

    renderer.shadowMap.enabled = true;

    // シーンを作成 
    const scene = new THREE.Scene();

    // カメラを作成 
    const camera = new THREE.PerspectiveCamera(30, width / height, 1.0, 1500);
    camera.position.set(0, 20, -40);
    camera.lookAt(new THREE.Vector3(0, 0, 0));

    // 平面を作成 
    const boxGeometry = new THREE.BoxGeometry(10, 10, 10);
    const boxMaterial = new THREE.MeshStandardMaterial({
        color: 0xffffff
    });
    const box = new THREE.Mesh(boxGeometry, boxMaterial);

    scene.add(box);

    const planeGeometry = new THREE.PlaneGeometry(50, 50);
    const planeMaterial = new THREE.MeshStandardMaterial({
        color: 0xaaaaaa
    });
    const plane = new THREE.Mesh(planeGeometry, planeMaterial);
    plane.position.set(0, -5, 0);
    plane.rotateX(-Math.PI / 2, 0, 0);

    scene.add(plane);

    document.addEventListener("keydown", onDocumentKeyDown, false);
    function onDocumentKeyDown(event_k) {
        let keyCode = event_k.which;
        // r:y軸周りに30度回転
        if (keyCode == 82) {
            box.rotateY(Math.PI / 6);
        }
        //c:色の変化
        if (keyCode == 67 && count % 4 == 0) {
            console.log("white");
            box.material.color.set(0xffffff);
            count += 1;
        }
        else if (keyCode == 67 && count % 4 == 1) {
            box.material.color.set(0xff0000);
            count += 1;
        }
        else if (keyCode == 67 && count % 4 == 2) {
            box.material.color.set(0x00ff00);
            count += 1;
        }
        else if (keyCode == 67 && count % 4 == 3) {
            box.material.color.set(0x0000ff);
            count += 1;
        }

        render();
    }

    // 平行光源 
    const directionalLight = new THREE.DirectionalLight(0xffffff);
    directionalLight.position.set(1, 1, 1);

    // シーンに追加 
    scene.add(directionalLight);

    const ambientLight = new THREE.AmbientLight(0xffffff, 0.5);
    scene.add(ambientLight);
    // 初回実行 
    let render = function () { renderer.render(scene, camera); };
    render();
} 