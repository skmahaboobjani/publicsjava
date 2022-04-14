"use strict";
var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
exports.__esModule = true;
exports.Tiger = exports.Lion = void 0;
var abstract_demo_1 = require("./abstract_demo");
var Lion = /** @class */ (function (_super) {
    __extends(Lion, _super);
    function Lion(name) {
        return _super.call(this, name) || this;
    }
    Lion.prototype.talk = function () {
        return "Lion is louding";
    };
    return Lion;
}(abstract_demo_1.Animal));
exports.Lion = Lion;
var Tiger = /** @class */ (function (_super) {
    __extends(Tiger, _super);
    function Tiger(name) {
        return _super.call(this, name) || this;
    }
    Tiger.prototype.talk = function () {
        return "Tiger is louding";
    };
    return Tiger;
}(abstract_demo_1.Animal));
exports.Tiger = Tiger;
