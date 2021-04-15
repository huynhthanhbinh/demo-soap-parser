/**
 * Run this code with Node to test the sample response json
 * Command: node <file_name>.js
 * Require: install Node before
 */

const sampleResponseJO = require("./sample_response_v2.json");

const seatConfig = sampleResponseJO.seatConfig;
const ssrConfig = sampleResponseJO.ssrConfig;
const seatDetails = sampleResponseJO.seatDetails;

console.log(seatConfig.cabinName);
console.log(seatConfig.compartments[0]);
console.log(ssrConfig.JLCH);
console.log(ssrConfig.JPET.fee);
console.log(seatDetails["31A"].ssrCode);
